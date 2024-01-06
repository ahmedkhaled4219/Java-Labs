package quadratic;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnno {
String str();
int val();
}
