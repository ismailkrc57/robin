package com.example.robin.business.abstracts;

import com.example.robin.core.utilities.results.DataResult;
import com.example.robin.core.utilities.results.Result;
import com.example.robin.entities.concretes.Waiter;

import javax.xml.crypto.Data;
import java.util.List;

public interface IWaiterService {
    DataResult<List<Waiter>> getAll();
    Result add(Waiter waiter);
    DataResult<Waiter> getById(int id);
    DataResult<Waiter> getByUserNameAndPassword(String username, String password);

}
