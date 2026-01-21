pipeline {
  agent any

  options { timestamps() }

  stages {
    stage('Checkout') {
      steps {
        checkout scm
        bat 'git --version'
        bat 'java -version'
        bat 'mvn -v'
      }
    }

    stage('Build') {
      steps {
        bat 'mvn -B -DskipTests clean package'
      }
    }

    stage('Test') {
      steps {
        bat 'mvn -B test'
      }
      post {
        always {
          junit allowEmptyResults: true, testResults: '**/target/surefire-reports/*.xml'
        }
      }
    }
  }
}
