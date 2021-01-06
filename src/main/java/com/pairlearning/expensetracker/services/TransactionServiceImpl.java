package com.pairlearning.expensetracker.services;

import com.pairlearning.expensetracker.exceptions.EtBadRequestException;
import com.pairlearning.expensetracker.exceptions.EtResourcesNotFoundException;
import com.pairlearning.expensetracker.model.Transaction;
import com.pairlearning.expensetracker.repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
@Transactional
public class TransactionServiceImpl implements  TransactionService{

    @Autowired
    TransactionRepository transactionRepository;

    @Override
    public List<Transaction> fetchAllTransactions(Integer userId,Integer categoryId) {
        return null;
    }

    @Override
    public Transaction fetchTransactionById(Integer userId,Integer categoryId,Integer transactionId) throws EtResourcesNotFoundException {
        return null;
    }

    @Override
    public Transaction addTransaction(Integer userId,Integer categoryId,Double amount,String note,Long transactionDate) throws EtBadRequestException {
        int transactionId = transactionRepository.create(userId, categoryId, amount, note, transactionDate);
        return transactionRepository.findById(userId, categoryId, transactionId);
    }

    @Override
    public void updateTransaction(Integer userId,Integer categoryId,Integer transactionId,Transaction transaction) throws EtBadRequestException {

    }

    @Override
    public void removeTransaction(Integer userId,Integer categoryId,Integer transactionId) throws EtResourcesNotFoundException {

    }
}