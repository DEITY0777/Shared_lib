def call(imageName) {
    sh """
        trivy image --ignore-unfixed \
        --exit-code 1 \
        --severity CRITICAL \
        ${imageName}
    """
}
