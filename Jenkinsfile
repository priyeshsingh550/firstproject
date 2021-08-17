
pipeline {
    agent
    stages {
        stage('clone') {
          steps{
                   git 'https://github.com/priyeshsingh550/firstproject.git'
          }
    }
          
        stage('compile and run') {
            steps {
                sh 'javac helloworld.java
                      java Simple'
                    
            }
        }
    }
