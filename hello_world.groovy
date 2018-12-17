pipelineJob("pipeline-calls-other-pipelie") {
    logRotator{
        numToKeep 30
    }
    definition {
        cps {
            sandbox()
            script("""
                node {
                    stage 'Hello world'
                    echo 'Hello World 1'

                    stage "invoke another pipeline"
                    build 'pipeline-being-called'

                    stage 'Goodbye world'
                    echo "Goodbye world"
                }
            """.stripIndent())
        }
    }
}

