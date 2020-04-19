package cz.arthedain.worldevents.common;

import com.google.inject.Singleton;

import java.util.HashMap;
import java.util.Map;

@Singleton
public class WorldEventService {

    private Map<String, ScheduledEvent> map = new HashMap<>();


}
