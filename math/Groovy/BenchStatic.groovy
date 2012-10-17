import groovy.transform.CompileStatic

@CompileStatic
def compute(int number) {
    int i = 0;
    while (i < number) {
        if (i % 123 == 0) {
            i = i + 10;
        } else {
            i = i + 1;
        }
    }
    println "result is $i"
}

compute(1000000000)

