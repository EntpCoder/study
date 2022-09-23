package com.songyang.controller;

import com.songyang.common.R;
import com.songyang.entity.Product;
import com.songyang.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 产品表  前端控制器
 * </p>
 *
 * @author Yang Song
 * @since 2022-09-23
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    private final IProductService productService;
    public ProductController(IProductService iProductService){
        this.productService = iProductService;
    }
    @GetMapping("/getAll")
    public R getAllProduct(){
        List<Product> list = productService.list();
        return R.ok().data("products",list);
    }
}
