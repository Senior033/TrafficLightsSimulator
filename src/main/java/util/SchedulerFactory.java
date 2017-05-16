package util;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public final class SchedulerFactory {

    private SchedulerFactory() {

    }

    public static ScheduledExecutorService createTaskScheduler() {
        return Executors.newSingleThreadScheduledExecutor();
    }

    public static ScheduledExecutorService newIfNullOrShutdown(final ScheduledExecutorService executorService) {
        return executorService == null || executorService.isShutdown() ? createTaskScheduler() : executorService;
    }

}
