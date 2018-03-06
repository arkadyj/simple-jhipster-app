package com.jhipster.service;

import com.jhipster.domain.Task;

public interface TaskService {

    Iterable<Task> list();

    Task save(Task task);
}
