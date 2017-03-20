package ch.heigvd.res.stpatrick;

import java.io.Reader;
import java.io.Writer;
import java.io.BufferedReader;
import java.io.BufferedWriter;

/**
 * This class is responsible for providing different types of Stream Processors.
 *
 * @author Olivier Liechti
 */
public class ARemoverStreamDecoratorController implements IStreamDecoratorController {

    @Override
    public Reader decorateReader(Reader inputReader) {
        return new BufferedReader(inputReader);
    }

    @Override
    public Writer decorateWriter(Writer outputWriter) {
        return new BufferedWriter(outputWriter);
    }

}
