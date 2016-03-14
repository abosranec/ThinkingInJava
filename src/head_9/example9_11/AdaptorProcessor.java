package head_9.example9_11;

/**
 * Created by Pasha on 05.03.2016.
 */
public class AdaptorProcessor implements Processor {
    StringChange stringChange;

    public AdaptorProcessor(StringChange stringChange) {
        this.stringChange = stringChange;
    }
    @Override
    public String name() {
        return stringChange.name();
    }
    @Override
    public String process(Object input) {
        return stringChange.methodChange((String)input);
    }
    public static void main(String[] args) {
        Apply.process((new AdaptorProcessor(new StringChange())), "a s d f g h j k l ");
    }
}
