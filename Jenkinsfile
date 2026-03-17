pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                deleteDir()
                git branch: 'main', url: 'https://github.com/ganesh999999/dockerdemo.git'
            }
        }

        stage('Deploy') {
            steps {
                sh 'docker-compose down || true'
                sh 'DOCKER_BUILDKIT=0 docker-compose up --build -d'
            }
        }
    }
}