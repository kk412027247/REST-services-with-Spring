package evolutionPayroll;

public class OrderNotFoundException extends RuntimeException {
  public OrderNotFoundException(Long id) {
    super("Cound not find order " + id);
  }
}
