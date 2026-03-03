def call(String branch, String commitMessage) {

    sshagent(['github-ssh']) {

        sh """
            git config user.email "jenkins@local"
            git config user.name "Jenkins CI"

            git checkout -B ${branch}

            git add .
            git commit -m "${commitMessage}" || echo "No changes to commit"

            git push origin ${branch}
        """
    }
}
