package com.martroutine.android.common.skeleton.qualifier;

/**
 * Created by MARTROUTINE on 04/06/2014.
 */
import java.lang.annotation.Retention;
import javax.inject.Qualifier;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Qualifier
@Retention(RUNTIME)
public @interface ForApplication {
}
