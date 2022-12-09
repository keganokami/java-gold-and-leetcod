package annotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class NotNullValidator {
  public static List<String> validate(Object target) {
    try {
      List<String> messages = new ArrayList<>();
      Class clazz = target.getClass();
      Field[] fields = clazz.getDeclaredFields();

      for(Field field : fields) {
        field.setAccessible(true);
        NotNull ano = field.getAnnotation(NotNull.class);
        if (ano == null) {
          continue;
        }

        if (field.get(target) != null) {
          continue;
        }

        messages.add(ano.message());
      }
      return messages;
    } catch (Exception e) {
      throw new RuntimeException();
    }
  }
}
