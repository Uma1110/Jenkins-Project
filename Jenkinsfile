pipeline {
    agent any

    options {
        skipDefaultCheckout(true)
    }

    stages {

        stage('Checkout') {
            steps {
                checkout scm
                echo 'Code downloaded from GitHub'
            }
        }

        stage('Build') {
            steps {
                sh 'mvn -B clean compile'
            }
        }

        stage('Test') {
            steps {
                sh 'mvn -B test'
            }
        }

        stage('Package') {
            steps {
                sh 'mvn -B package -DskipTests'
            }
        }
    }

    post {
        always {
            junit allowEmptyResults: true,
                  testResults: 'target/surefire-reports/*.xml'

            archiveArtifacts artifacts: 'target/*.jar',
                             allowEmptyArchive: true
        }

        success {
            echo 'Java CI pipeline completed successfully!'
        }
    }
}
