# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # TwoFactorAuthenticationModel Model.
  class TwoFactorAuthenticationModel < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :request

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :to

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :verified

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['request'] = 'request'
        @_hash['to'] = 'to'
        @_hash['verified'] = 'verified'
        @_hash['id'] = 'id'
      end
      @_hash
    end

    def initialize(request = nil,
                   to = nil,
                   verified = nil,
                   id = nil,
                   additional_properties = {})
      @request = request
      @to = to
      @verified = verified
      @id = id

      # Add additional model properties to the instance.
      additional_properties.each do |_name, value|
        instance_variable_set("@#{_name}", value)
      end
    end

    # Creates an instance of the object from a hash.
    def self.from_hash(hash)
      return nil unless hash

      # Extract variables from the hash.
      request = hash['request']
      to = hash['to']
      verified = hash['verified']
      id = hash['id']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      TwoFactorAuthenticationModel.new(request,
                                       to,
                                       verified,
                                       id,
                                       hash)
    end
  end
end
