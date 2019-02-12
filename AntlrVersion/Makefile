build:
	java -Xmx500M -cp "/usr/local/lib/antlr-4.7.1-complete.jar:$CLASSPATH" org.antlr.v4.Tool Bonus.g4 -visitor
	javac *.java

run:
	java HelloRunner

clean:
	rm *.class