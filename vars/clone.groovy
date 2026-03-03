def call(repoUrl, branch) {
    checkout([
        $class: 'GitSCM',
        branches: [[name: branch]],
        userRemoteConfigs: [[
            url: repoUrl,
            credentialsId: 'github-ssh'
        ]]
    ])
}
