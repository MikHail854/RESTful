package ru.chigurov.rest_example.service;

import ru.chigurov.rest_example.model.Client;

import java.util.List;

public interface ClientService {

    /**
     * Создает нового клиента
     * @param @client - клиент для созания
     */
    void create(Client client);

    /**
     * Возвращяет список всех имеющихся клиентов
     * @return список клиентов
     */
    List<Client> readAll();

    /**
     * Возвращает клиента по его ID
     * @param id - ID клиента
     * @return - объект клиента по заданным ID
     */
    Client read(int id);

    /**
     * Обновляет клиента по заданным ID, в соответствии с переданным клиентом
     * @param client - клиент в соответствии с которым нужно обновить данные
     * @param id - id клиента, которого нужно обновить
     * @return - true если данные были обновлены, инче false
     */
    boolean update(Client client, int id);

    /**
     * Удаляет клиента по заданным ID
     * @param id - id клмента которого нужно удалить
     * @return - true если клиент был удален, иначе false
     */
    boolean delete(int id);

}
