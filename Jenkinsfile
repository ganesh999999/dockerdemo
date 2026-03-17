pipeline {
    agent any

    stages {

        stage('Clone Code') {
            steps {
                git 'https://github.com/ganesh999999/dockerdemo.git'
            }
        }

        stage('Build Docker Image') {
            steps {
                sh 'docker compose build'
            }
        }

        stage('Run Containers') {
            steps {
                sh 'docker compose down'
                sh 'docker compose up -d'
            }
        }
    }
}