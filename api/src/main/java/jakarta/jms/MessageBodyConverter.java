package jakarta.jms;

public interface MessageBodyConverter<T extends Message> {
  <K> K convert(T message, Class<K> targetClass);
}
