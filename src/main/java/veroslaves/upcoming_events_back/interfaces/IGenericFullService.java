package veroslaves.upcoming_events_back.interfaces;

import java.util.List;

import veroslaves.upcoming_events_back.events.Event;

public interface IGenericFullService<T> {
    public List<T> getAll();
    public T getById(Long id) throws Exception;
    public T save(T obj);
    
    // public T getByEvent_title(String title) throws Exception;
    public Event update(Long id, Event event) throws Exception;
}
