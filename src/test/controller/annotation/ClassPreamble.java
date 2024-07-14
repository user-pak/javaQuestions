package test.controller.annotation;

import java.lang.annotation.Documented;

@Documented
@interface ClassPreamble {

	String author();
	String date();
}
