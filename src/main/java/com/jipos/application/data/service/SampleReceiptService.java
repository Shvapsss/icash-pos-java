package com.jipos.application.data.service;

import com.jipos.application.data.entity.SampleReceipt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.vaadin.artur.helpers.CrudService;

@Service
public class SampleReceiptService extends CrudService<SampleReceipt, Integer> {

    private SampleReceiptRepository repository;

    public SampleReceiptService(@Autowired SampleReceiptRepository repository) {
        this.repository = repository;
    }

    @Override
    protected SampleReceiptRepository getRepository() {
        return repository;
    }

}