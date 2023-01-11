def call(Map config) {
    sh(returnStdout: true, script: 'date +"%Y_%m_%d_%H_%M_%S"').trim()
}
