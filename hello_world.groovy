pipelineJob('Hello World of cicd Test 01') {
  steps {
    shell('node {
                    stage "Hello world"
                    echo "Hello World 1"

                }'
         )
  }
}
