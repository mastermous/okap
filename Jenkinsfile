pipeline {
    agent any
    tools {
        maven 'maven'
        jdk 'java'
    }
    stages {
        stage('Checkout') {
            steps {
                git 'https://github.com/mastermous/okap.git'
            }
        }
        stage('Compile') {
            steps {
                bat 'mvn compile'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Package') {
            steps {
                bat 'mvn package'
            }
        }
        stage('SonarQube analysis') {
            steps {
                withSonarQubeEnv('SonarQube') { 
                    bat 'mvn sonar:sonar'
                }
            }
        }
        stage('Nexus deployment') {
            steps {
                nexusArtifactUploader artifacts: [[artifactId: 'okap', classifier: '', file: 'target/okap-1.0.jar', type: 'jar']], credentialsId: 'nexus', groupId: 'com.groupeisi.m2gl', nexusUrl: 'http://localhost:8081', nexusVersion: 'nexus3', protocol: 'http', repository: 'okap', version: '1.0' // Dépôt de l'artefact dans Nexus
            }
        }
    }
}
