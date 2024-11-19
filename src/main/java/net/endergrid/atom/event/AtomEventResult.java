package net.endergrid.atom.event;

/**
 * Represents the result of an event.
 * <p>
 * The `CONTINUE` and `CANCELLED` constants represent the two possible default results of an event.
 * <p>
 * The `Cancelled` interface is a marker interface that indicates the event was cancelled.
 * <p>
 * You can create your own implementation of this interface to represent a custom result for an event.
 */
public interface AtomEventResult {
    static final AtomEventResult CONTINUE = new AtomEventResult() {};
    static final AtomEventResult CANCELLED = new Cancelled() {};

    default boolean isCancelled() {
        return this instanceof Cancelled;
    }

    static interface Cancelled extends AtomEventResult {}
}
