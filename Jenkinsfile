pipeline {
    agent {
        label 'jenkins-jenkins-agent'
    }
  
    stages {
        stage("Run test"){
            steps {
                script{
                    withGradle {
                    sh 'cd src/test && gradle build'
                }
                }
            }
        }
      
    }
}