package com.example.robin.business.concretes;

import com.example.robin.business.abstracts.IWaiterService;
import com.example.robin.core.utilities.results.DataResult;
import com.example.robin.core.utilities.results.Result;
import com.example.robin.core.utilities.results.SuccessDataResult;
import com.example.robin.core.utilities.results.SuccessResult;
import com.example.robin.dataAccess.abstracts.IWaiterDao;
import com.example.robin.entities.concretes.Waiter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WaiterManager implements IWaiterService {
    private  IWaiterDao iWaiterDao;

    @Autowired
    public WaiterManager(IWaiterDao iWaiterDao) {
        this.iWaiterDao = iWaiterDao;
    }

    @Override
    public DataResult<List<Waiter>> getAll() {
        return new SuccessDataResult<>(iWaiterDao.findAll());
    }

    @Override
    public Result add(Waiter waiter) {
        iWaiterDao.save(waiter);
        return new SuccessResult("garson eklendi");
    }

    @Override
    public DataResult<Waiter> getById(int id) {
        return new SuccessDataResult<>(iWaiterDao.getById(id));
    }

    @Override
    public DataResult<Waiter> getByUserNameAndPassword(String userName, String password) {
        return new SuccessDataResult<>(iWaiterDao.getByUserNameAndPassword(userName,password));
    }
}
