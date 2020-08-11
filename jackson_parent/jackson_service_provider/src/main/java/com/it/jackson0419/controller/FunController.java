package com.it.jackson0419.controller;

import com.it.jackson0419.service.IFunService;
import com.it.jackson0419.vo.FunVO;
import com.it.jackson0419.vo.PageResult;
import com.it.jackson0419.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/funController")
public class FunController {
    @Autowired
    IFunService funService;

    @PostMapping(value = "/getFun")
    public ResultVO getFun(@RequestBody FunVO funVO) {
        return funService.getFun(funVO);
    }
}
