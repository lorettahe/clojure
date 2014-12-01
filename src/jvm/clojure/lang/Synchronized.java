package clojure.lang;

import clojure.lang.IFn;

/**
 * Created by loretta on 01/12/14.
 */
public class Synchronized {
    public static Object lock(final Object lockee, final IFn f) {
        synchronized (lockee) {
            return f.invoke();
        }
    }
}
