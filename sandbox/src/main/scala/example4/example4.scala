package object example4
    extends com.github.nscala_time.time.Imports // let's have Joda everywhere
    with io.jvm.uuid.Imports                    // let's have UUID everywhere
    with PoorMansSQL                            // 10 line custom DSL example
