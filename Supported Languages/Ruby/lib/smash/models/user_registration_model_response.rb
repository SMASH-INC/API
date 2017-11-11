# This file was automatically generated for SMASH by SMASH v2.0
# ( https://smashlabs.io ).

module Smash
  # UserRegistrationModelResponse Model.
  class UserRegistrationModelResponse < BaseModel
    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :request

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :active

    # TODO: Write general description for this method
    # @return [String]
    attr_accessor :id

    # TODO: Write general description for this method
    # @return [UserProfileInformationModel]
    attr_accessor :info

    # A mapping from model property names to API property names.
    def self.names
      if @_hash.nil?
        @_hash = {}
        @_hash['request'] = 'request'
        @_hash['active'] = 'active'
        @_hash['id'] = 'id'
        @_hash['info'] = 'info'
      end
      @_hash
    end

    def initialize(request = nil,
                   active = nil,
                   id = nil,
                   info = nil,
                   additional_properties = {})
      @request = request
      @active = active
      @id = id
      @info = info

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
      active = hash['active']
      id = hash['id']
      info = UserProfileInformationModel.from_hash(hash['info']) if
        hash['info']

      # Clean out expected properties from Hash.
      names.each_value { |k| hash.delete(k) }

      # Create object from extracted values.
      UserRegistrationModelResponse.new(request,
                                        active,
                                        id,
                                        info,
                                        hash)
    end
  end
end
