
document.addEventListener("DOMContentLoaded", function () {
    const form = document.getElementById("filterForm");
    const minPriceInput = form.querySelector("input[placeholder='Từ']");
    const maxPriceInput = form.querySelector("input[placeholder='Đến']");
    const errorDiv = document.getElementById("price-error");

    form.addEventListener("submit", function (event) {
        const minPrice = parseFloat(minPriceInput.value);
        const maxPrice = parseFloat(maxPriceInput.value);

        // Xóa thông báo lỗi cũ
        errorDiv.style.display = "none";
        errorDiv.textContent = "";

        // Kiểm tra định dạng
        if (isNaN(minPrice) || isNaN(maxPrice)) {
            showError("Vui lòng nhập đúng định dạng giá (số).");
            event.preventDefault();
            return;
        }

        if (minPrice < 0 || maxPrice < 0) {
            showError("Giá không được nhỏ hơn 0.");
            event.preventDefault();
            return;
        }

        if (minPrice > maxPrice) {
            showError("Giá tối thiểu không được lớn hơn giá tối đa.");
            event.preventDefault();
            return;
        }
    });

    function showError(message) {
        errorDiv.textContent = message;
        errorDiv.style.display = "block";
    }
});
