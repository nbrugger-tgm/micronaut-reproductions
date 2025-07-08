package com.demo.processor;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.annotation.processing.SupportedAnnotationTypes;
import javax.lang.model.element.TypeElement;
import java.io.IOException;
import java.util.Set;

@SupportedAnnotationTypes("io.swagger.v3.oas.annotations.OpenAPIDefinition")
public class ApiGeneratingProcessor extends AbstractProcessor {
    private boolean generated = false;

    @Override
    public boolean process(Set<? extends TypeElement> annotations, RoundEnvironment roundEnv) {
	if(generated) return false;
        try (var writer = processingEnv.getFiler().createSourceFile("com.example.controller.PingService").openWriter()) {
            writer.append("package com.example.controller;\n" +
                    "\n" +
                    "import io.micronaut.http.annotation.*;\n" +
                    "\n" +
                    "@Controller\n" +//remove this line to make the endpoint disappear from the OAS file, BUT this is from a architecure point of view not correct
                    "public interface PingService {\n" +
                    "\t@Get(\"/ping\")\n" +
                    "\tString ping();\n" +
                    "}\n");
	    generated = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;//false to make the interface processable by others
    }
}
