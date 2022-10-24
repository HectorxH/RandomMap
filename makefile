compile:
	mkdir -p build/classes
	mkdir -p build/jar
	javac -sourcepath src/ -d build/classes src/Tarea3/*.java
	jar cfm JavaQuest.jar manifest.mf -C build/classes .
run:
	java -jar JavaQuest.jar 