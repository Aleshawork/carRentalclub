package service.work.carrentalclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.Rent;
import service.work.carrentalclub.repos.RentRepo;

import java.util.List;

@Service
public class RentService {

    @Autowired
    private RentRepo rentRepo;

    public List<Rent> findAll() {
        return (List<Rent>) rentRepo.getAll();
    }



}
