# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash

  Logging.logger.root.appenders = Logging.appenders.stdout
  Logging.logger.root.level = :info

  # All configuration including auth info and base URI for the API access
  # are configured in this class.
  class Configuration
    # Set the array parameter serialization method.
    # (allowed: indexed, unindexed, plain, csv, tsv, psv)
    @array_serialization = 'indexed'

    # An enum for SDK environments.
    class Environment
      #PRODUCTION: Production Enviroment
      #SANDBOX: Testing and Debugging
      #BETA: Updated Nightly (May Contain Bugs)
      ENVIRONMENT = [PRODUCTION = 0, SANDBOX = 1, BETA = 2].freeze
    end

    # An enum for API servers.
    class Server
      SERVER = [PATH = 0].freeze
    end

    # The environment in which the SDK is running.
    @environment = Environment::PRODUCTION

    # Your user ID
    @uid = 'UID'

    # Your Private API Key
    @secret = 'SECRET'

    # Your Public API Key
    @key = 'KEY'

    # All the environments the SDK can run in.
    @environments = {
      Environment::PRODUCTION => {
        Server::PATH => 'https://api.rest.sh/api'
      },
      Environment::SANDBOX => {
        Server::PATH => 'https://sb.rest.sh/api'
      },
      Environment::BETA => {
        Server::PATH => 'https://b.rest.sh/api'
      }
    }

    # Generates the appropriate base URI for the environment and the server.
    # @param [Configuration::Server] The server enum for which the base URI is
    # required.
    # @return [String] The base URI.
    def self.get_base_uri(server = Server::PATH)
      environments[environment][server]
    end

    # The attribute accessors for public properties.
    class << self
      attr_accessor :array_serialization
      attr_accessor :environment
      attr_accessor :environments
      attr_accessor :uid
      attr_accessor :secret
      attr_accessor :key
    end
  end
end
