package com.songyang.controller;

import com.songyang.entity.Product;
import com.songyang.result.R;
import com.songyang.service.IProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Yang Song
 * @date 2022/10/25 15:56
 */
@RestController
@RequestMapping("/product")
@CrossOrigin
public class ProductController {
    private final IProductService productService;
    public ProductController(IProductService productService) {
        this.productService = productService;
    }

    /**
     *
     * @param productName 商品名称
     * @param pageNum 页码
     * @return 统一结果集
     */
    @GetMapping("/getProductByName/{productName}/{pageNum}")
    public R<List<Product>> getProductByName(@PathVariable("productName") String productName,
                                             @PathVariable("pageNum") Integer pageNum){
        return R.ok("productList",productService.searchHighByProName(productName,pageNum));
    }
}
