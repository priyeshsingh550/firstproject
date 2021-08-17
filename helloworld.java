
pipeline {
    agent
    stages {
        stage('clone')
          steps{
          
        stage('build') {
            steps {
                sh 'mvn --version'
            }
        }
    }
}
