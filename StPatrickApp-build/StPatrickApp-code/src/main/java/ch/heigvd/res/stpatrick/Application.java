package ch.heigvd.res.stpatrick;


/**
 *
 * @author Olivier Liechti
 */
public class Application {

    IStreamProcessorsFactory processorsFactory = new StreamProcessorsFactory();

    public IStreamProcessorsFactory getStreamProcessorsFactory() {
        return processorsFactory;
    }

    public IStreamProcessor getProcessor() {
        return processorsFactory.getProcessor();
    }

    IStreamDecoratorController getStreamDecoratorController() {
        return new ARemoverStreamDecoratorController();
    }

}
