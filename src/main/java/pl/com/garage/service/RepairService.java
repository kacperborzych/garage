package pl.com.garage.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.com.garage.dao.RepairDao;

@Service
public class RepairService {

    @Autowired
    private RepairDao repairDao;
}
