pipeline {
    agent any
    tools {
        maven 'MAVEN'
    }
    stages {
        stage ('Build') {
            steps {
                sh 'mvn -Dmaven.test.failure.ignore=true install' 
                sh 'mvn  test' 
            }
        }
    }
}