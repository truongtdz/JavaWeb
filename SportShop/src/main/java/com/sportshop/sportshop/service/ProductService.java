    package com.sportshop.sportshop.service;

    import com.sportshop.sportshop.dto.request.ProductRequest;
    import com.sportshop.sportshop.dto.request.SearchRequest;
    import com.sportshop.sportshop.dto.response.ProductResponse;

    import org.springframework.data.domain.Page;
    import org.springframework.stereotype.Service;

    import java.util.List;

    @Service
    public interface ProductService {
        // Count product
        public int countProduct();

        // View all product
        Page<ProductResponse> getAllProductsPaginated(int page, int size, String sortField, String sortDir);

        Page<ProductResponse> getAllProductsDeleted(int page, int size, String sortField, String sortDir);

        // View list product sale
        public List<ProductResponse> getProductSale();

        // View list product the newest
        public List<ProductResponse> getProductNewest();

        // View product by ID
        public ProductResponse getProductById(Long productId);

        // Create product
        public ProductResponse createProduct(ProductRequest productRequest);

        // Update Product
        public ProductResponse updateProduct(Long productId, ProductRequest productRequest);

        // Update Product
        public ProductResponse restoreProduct(Long productId);

        // Delete Product
        public void deleteProduct(Long productId);

        // Search Product
        Page<ProductResponse> searchProduct(SearchRequest request, int page, int size);

    }
