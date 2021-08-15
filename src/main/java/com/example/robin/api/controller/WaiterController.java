package com.example.robin.api.controller;

import com.example.robin.business.abstracts.IWaiterService;
import com.example.robin.core.utilities.results.DataResult;
import com.example.robin.core.utilities.results.Result;
import com.example.robin.core.utilities.results.SuccessDataResult;
import com.example.robin.entities.concretes.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin
@RestController
@RequestMapping("api/waiters")
public class WaiterController {
    private IWaiterService iWaiterService;

    @Autowired
    public WaiterController(IWaiterService iWaiterService) {
        this.iWaiterService = iWaiterService;
    }

    @GetMapping("/getall")
    public DataResult<List<Waiter>> getAll()
    {
        return iWaiterService.getAll();
    }
    @PostMapping("/add")
    public Result add(@RequestBody Waiter waiter)
    {
        return iWaiterService.add(waiter);
    }
    @GetMapping("getbyid")
    public DataResult<Waiter> getById(@RequestParam int id){
        return iWaiterService.getById(id);
    }
}
