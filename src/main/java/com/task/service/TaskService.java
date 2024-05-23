package com.task.service;

import com.task.modal.Task;
import com.task.modal.TaskStatus;

import java.util.List;

public interface TaskService {

    Task createTask(Task task,String requestedRole)throws Exception;

    Task getTaskById(Long id)throws Exception;

    List<Task> getAllTask(TaskStatus status);

    Task updateTask(Long id,Task UpdatedTask,Long userId)throws Exception;

    void deleteTask(Long id) throws Exception;

    Task assignedToUser(Long userId,Long taskId)throws Exception;

    List<Task> assignedUsersTask(Long userId,TaskStatus status);

    Task completeTask(Long taskId)throws Exception;
}
