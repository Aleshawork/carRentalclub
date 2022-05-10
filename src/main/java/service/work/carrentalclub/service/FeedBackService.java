package service.work.carrentalclub.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.work.carrentalclub.model.FeedBack;
import service.work.carrentalclub.repos.FeedBackRepo;

import java.util.List;

@Service
public class FeedBackService {

    @Autowired
    private FeedBackRepo feedBackRepo;

    /**
     * Поиск всех часто задаваемых вопросов
     * @return массив элементов
     */
    public List<FeedBack> findAll() {
        return (List<FeedBack>) feedBackRepo.getAll();
    }
}
