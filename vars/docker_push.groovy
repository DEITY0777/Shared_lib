def call(String image, String tag) {

    withCredentials([usernamePassword(
        credentialsId: 'docker',
        usernameVariable: 'DOCKER_USER',
        passwordVariable: 'DOCKER_PASS'
    )]) {

        sh """
            echo \$DOCKER_PASS | docker login -u \$DOCKER_USER --password-stdin
            docker push ${image}:${tag}
        """
    }
}
